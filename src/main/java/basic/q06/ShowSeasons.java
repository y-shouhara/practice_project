package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int seasonNum = 13;

		switch (seasonNum) {
		case 3:
		case 4:
		case 5:
			System.out.println(seasonNum + "月は春です。");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(seasonNum + "月は夏です。");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(seasonNum + "月は秋です。");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(seasonNum + "月は冬です。");
			break;
		default:
			System.out.println(seasonNum + "月は存在しないです。");
			break;
		}

	}

}
