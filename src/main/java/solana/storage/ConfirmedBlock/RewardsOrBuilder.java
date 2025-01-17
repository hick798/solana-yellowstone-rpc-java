// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

public interface RewardsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.Rewards)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  java.util.List<Reward>
      getRewardsList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  Reward getRewards(int index);
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  int getRewardsCount();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  java.util.List<? extends RewardOrBuilder>
      getRewardsOrBuilderList();
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  RewardOrBuilder getRewardsOrBuilder(
      int index);

  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   * @return Whether the numPartitions field is set.
   */
  boolean hasNumPartitions();
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   * @return The numPartitions.
   */
  NumPartitions getNumPartitions();
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   */
  NumPartitionsOrBuilder getNumPartitionsOrBuilder();
}
