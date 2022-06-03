public class Blockchain {
    public static int prefix = 4;
    public static String prefixString = new String(new char[prefix]).replace('\0', '0');

    public List<Block> blockchain = new ArrayList<Block>();

    void addBlock(Block block) {
        blockchain.add(block);
        block.mineBlock(prefix);
    }
}
