package magic8ball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WiseSayings {

	List<String> sayings;
	Random rand;
	int randomNum;
	
	public WiseSayings() {
		rand = new Random();
		sayings = Arrays.asList("As I see\nit, yes", "Ask again later", "Better not\ntell you\nnow",
				"Cannot\npredict\nnow","Concentrate\nand ask\nagain","Don’t count\non it","It is\ncertain","It is\ndecidedly\nso",
				"Most likely","My reply\nis no","My sources\nsay no","Outlook not\nso good","Outlook\ngood","Reply hazy,\ntry again",
				"Signs\npoint to\nyes","Very\ndoubtful","Without\na doubt","Yes","Yes\ndefinitely","You may\nrely\non it");
	}
	
	String getRandomSaying() {
		int randomNum = rand.nextInt(0,20);
		return sayings.get(randomNum);
	}
	
	
	// make arraylist 
	// populate arraylist
	
	/*
	As I see it, yes.
	Ask again later.
	Better not tell you now.
	Cannot predict now.
	Concentrate and ask again.
	Don’t count on it.
	It is certain.
	It is decidedly so.
	Most likely.
	My reply is no.
	My sources say no.
	Outlook not so good.
	Outlook good.
	Reply hazy, try again.
	Signs point to yes.
	Very doubtful.
	Without a doubt.
	Yes.
	Yes – definitely.
	You may rely on it.
	*/
	
}
