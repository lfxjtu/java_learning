public class StaticMethod {
    public static void main(String[] args) {
        new Friend("SpongeBob");
        new Friend("Patrick");
        new Friend("Squidward");
//        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }

}
