package QAInteractive;

import java.util.ArrayList;

public class QAInteractive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Questions q = new Questions();
		Answers ans;
		ArrayList<Answers> al = new ArrayList<Answers>();
		q.setNum(1);
		q.setTitle("新光人壽長期關注環境保護及節能減碳，在環境保護上一直持續耕耘，2014年度我們正式導入ISO環境管理系統並執行碳盤查認證，" +
				"並由總經理正式簽署環境政策宣示，此外，今年更取得以下何種環境相關的認證?");
		ans = new Answers();
		ans.setNum(1);
		ans.setTitle("能源管理系統(ISO 50001)認證");
		ans.setAnswer(true);
		al.add(ans);
		ans = new Answers();
		ans.setNum(2);
		ans.setTitle("企業社會責任(SA 8000)認證");
		ans.setAnswer(false);
		al.add(ans);
		ans = new Answers();
		ans.setNum(3);
		ans.setTitle("資訊安全管理系統(ISO 27001)認證");
		ans.setAnswer(false);
		//add 1213
		ans = new Answers();
		ans.setNum(4);
		ans.setTitle("test1213");
		ans.setAnswer(false);
		al.add(ans);
		q.setAnsList(al);
		
		for(int i=0; i<1; i++){
			System.out.println(q.getNum());
			System.out.println(q.getTitle());
			ArrayList<Answers> ansList = q.getAnsList();
			for(int j=0; j<ansList.size(); j++){
				System.out.println(ansList.get(j).getNum());
				System.out.println(ansList.get(j).getTitle());
				System.out.println(ansList.get(j).isAnswer);
			}
			
		}
	}

}
