/*package test;

import com.aliyun.openservices.ons.api.PropertyKeyConst;

public class ConsumerTest {
	
	public static void main(String[] args) {

		Properties properties = new Properties();
		// 您在MQ控制台创建的Consumer ID
		properties.put(PropertyKeyConst.ConsumerId, "XXX");
		// 鉴权用AccessKey，在阿里云服务器管理控制台创建
		properties.put(PropertyKeyConst.AccessKey, "XXX");
		// 鉴权用SecretKey，在阿里云服务器管理控制台创建
		properties.put(PropertyKeyConst.SecretKey, "XXX");
		// 设置 TCP 接入域名（此处以公共云公网环境接入为例）
		properties.put(PropertyKeyConst.ONSAddr, "http://onsaddr-internet.aliyun.com/rocketmq/nsaddr4client-internet");
		Consumer consumer = ONSFactory.createConsumer(properties);
		consumer.subscribe("TopicTestMQ", "*", new MessageListener() {
			public Action consume(Message message, ConsumeContext context) {
				System.out.println("Receive: " + message);
				return Action.CommitMessage;
			}
		});
		consumer.start();
		System.out.println("Consumer Started");
	}
}*/