.class public Lorg/snmp4j/util/ArgumentParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;,
        Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;,
        Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;
    }
.end annotation


# static fields
.field public static final TYPES:[Ljava/lang/String;

.field public static final TYPE_INTEGER:I = 0x0

.field public static final TYPE_LONG:I = 0x1

.field public static final TYPE_OCTET_STRING:I = 0x3

.field public static final TYPE_STRING:I = 0x2


# instance fields
.field private optionFormat:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ">;"
        }
    .end annotation
.end field

.field private parameterFormat:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "s"

    const-string v1, "o"

    const-string v2, "i"

    const-string v3, "l"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/snmp4j/util/ArgumentParser;->TYPES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lorg/snmp4j/util/ArgumentParser;->parseFormat(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser;->optionFormat:Ljava/util/Map;

    const/4 p1, 0x1

    invoke-static {p2, p1}, Lorg/snmp4j/util/ArgumentParser;->parseFormat(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lorg/snmp4j/util/ArgumentParser;->parameterFormat:Ljava/util/Map;

    return-void
.end method

.method public static getFirstValue(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static getType(Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lorg/snmp4j/util/ArgumentParser;->TYPES:[Ljava/lang/String;

    invoke-static {v0, p0}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, p2, :cond_0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lorg/snmp4j/util/ArgumentParser;

    const-string v1, "org.snmp4j.OptionFormat"

    const-string v2, "-o1[i{parameter1}] -o2[s,l]"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "org.snmp4j.ParameterFormat"

    const-string v3, "-param1[i] -param2[s<(udp|tcp):.*[/[0-9]+]?>{=udp:127.0.0.1/161}] +optParam1[l{=-100}] .."

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/snmp4j/util/ArgumentParser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Option format is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/util/ArgumentParser;->getOptionFormat()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parameter format is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/snmp4j/util/ArgumentParser;->getParameterFormat()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0, p0}, Lorg/snmp4j/util/ArgumentParser;->parse([Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse args: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method protected static parseFormat(Ljava/lang/String;Z)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, " "

    move-object/from16 v3, p0

    invoke-direct {v1, v3, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".."

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    if-eqz v3, :cond_0

    invoke-static {v3, v6}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$002(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'..\' without parameter definition"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v3, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    invoke-direct {v3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;-><init>()V

    move/from16 v5, p1

    invoke-static {v3, v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$102(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x2b

    if-eq v8, v9, :cond_2

    move v8, v6

    goto :goto_1

    :cond_2
    move v8, v7

    :goto_1
    invoke-static {v3, v8}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$202(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Z)Z

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v8, "]"

    invoke-virtual {v4, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x5b

    invoke-virtual {v4, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$302(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$300(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v6

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-virtual {v4, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    new-instance v8, Ljava/util/StringTokenizer;

    const-string v9, ","

    invoke-direct {v8, v4, v9, v6}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v11, v6

    const/4 v10, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v8}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v12

    if-eqz v10, :cond_3

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object v12, v10

    goto :goto_3

    :cond_3
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_3
    const/16 v13, 0x3c

    invoke-virtual {v12, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v14

    if-lez v14, :cond_5

    const/16 v14, 0x3e

    invoke-virtual {v12, v14}, Ljava/lang/String;->indexOf(I)I

    move-result v14

    if-gez v14, :cond_5

    move-object v10, v12

    :cond_5
    new-instance v14, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    invoke-direct {v14}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;-><init>()V

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$402(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "}"

    invoke-virtual {v12, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-static {v12, v14}, Lorg/snmp4j/util/ArgumentParser;->parseParameterFormat(Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/lang/String;

    move-result-object v12

    :cond_6
    const-string v15, ">"

    invoke-virtual {v12, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-virtual {v12, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    add-int/lit8 v13, v10, 0x1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v15

    sub-int/2addr v15, v6

    invoke-virtual {v12, v13, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v13

    invoke-static {v14, v13}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$502(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/util/regex/Pattern;)Ljava/util/regex/Pattern;

    invoke-virtual {v12, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v10, v14}, Lorg/snmp4j/util/ArgumentParser;->parseParameterFormat(Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/lang/String;

    goto :goto_4

    :cond_7
    invoke-static {v10}, Lorg/snmp4j/util/ArgumentParser;->getType(Ljava/lang/String;)I

    move-result v2

    invoke-static {v14, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$602(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;I)I

    :goto_4
    const/4 v10, 0x0

    goto :goto_5

    :cond_8
    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {v12}, Lorg/snmp4j/util/ArgumentParser;->getType(Ljava/lang/String;)I

    move-result v2

    invoke-static {v14, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$602(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;I)I

    :goto_5
    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_2

    :cond_a
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    invoke-interface {v4, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    invoke-static {v3, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$702(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    goto :goto_7

    :cond_b
    invoke-static {v3, v4}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$302(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$100(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Z

    move-result v2

    if-nez v2, :cond_c

    :goto_7
    invoke-static {v3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->access$300(Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parameter "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " has no type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_8
    return-object v0
.end method

.method private static parseParameterFormat(Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/lang/String;
    .locals 5

    const/16 v0, 0x3c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "{"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/snmp4j/util/ArgumentParser;->getType(Ljava/lang/String;)I

    move-result v2

    invoke-static {p1, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$602(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;I)I

    const/16 v2, 0x7b

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x3d

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_1

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$802(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$402(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_1
    invoke-static {p1, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$402(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;)Ljava/lang/String;

    :goto_1
    const/16 p1, 0x3e

    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    if-lez p1, :cond_2

    add-int/lit8 v0, p1, 0x1

    :cond_2
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static selectCommand([Ljava/lang/String;Ljava/lang/String;[[Ljava/lang/String;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    new-instance v0, Lorg/snmp4j/util/ArgumentParser;

    const-string v1, "#command[s] +following[s] .."

    invoke-direct {v0, p1, v1}, Lorg/snmp4j/util/ArgumentParser;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lorg/snmp4j/util/ArgumentParser;->parse([Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "command"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/snmp4j/util/ArgumentParser;->getValue(Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    array-length p1, p2

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_1

    aget-object v2, p2, v1

    aget-object v3, v2, v0

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/text/ParseException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Command \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' not found"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method


# virtual methods
.method protected addValues2Option(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;>;)V"
        }
    .end annotation

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public getOptionFormat()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser;->optionFormat:Ljava/util/Map;

    return-object v0
.end method

.method public getParameterFormat()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "+",
            "Ljava/lang/String;",
            "+",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/snmp4j/util/ArgumentParser;->parameterFormat:Ljava/util/Map;

    return-object v0
.end method

.method public parse([Ljava/lang/String;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lorg/snmp4j/util/ArgumentParser;->parameterFormat:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v2

    move v4, v3

    :goto_0
    array-length v6, p1

    if-ge v4, v6, :cond_8

    aget-object v6, p1, v4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    aget-object v6, p1, v4

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v8, 0x2d

    if-ne v6, v8, :cond_2

    aget-object v5, p1, v4

    invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lorg/snmp4j/util/ArgumentParser;->optionFormat:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    if-eqz v6, :cond_1

    move-object v5, v6

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/text/ParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown option \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' at position "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    goto :goto_1

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isVariableLength()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    move-object v5, v2

    :goto_1
    if-eqz v5, :cond_7

    :goto_2
    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v6

    array-length v6, v6

    if-lez v6, :cond_6

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isParameter()Z

    move-result v6

    rsub-int/lit8 v8, v6, 0x1

    add-int/2addr v8, v4

    invoke-virtual {p0, p1, v8, v5}, Lorg/snmp4j/util/ArgumentParser;->parseValues([Ljava/lang/String;ILorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-static {v9, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v4, v6

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isVariableLength()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v8, v0}, Lorg/snmp4j/util/ArgumentParser;->addValues2Option(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6, v2, v0}, Lorg/snmp4j/util/ArgumentParser;->addValues2Option(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    :goto_3
    add-int/2addr v4, v7

    goto/16 :goto_0

    :cond_7
    new-instance p1, Ljava/text/ParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unrecognized parameter at position "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v4, -0x1

    if-eqz p1, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isMandatory()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v5

    array-length v5, v5

    if-lez v5, :cond_8

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_5
    if-ge v8, v7, :cond_a

    aget-object v9, v6, v8

    invoke-virtual {v9}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getDefaultValue()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_9

    invoke-virtual {v9}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getDefaultValue()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    invoke-virtual {p0, v9, v10, p1, v11}, Lorg/snmp4j/util/ArgumentParser;->parseParameterValue(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_9
    new-instance v0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;

    invoke-direct {v0, v4, v2, p1, v9}, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;-><init>(ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V

    throw v0

    :cond_a
    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v5, v0}, Lorg/snmp4j/util/ArgumentParser;->addValues2Option(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    goto :goto_4

    :cond_b
    new-instance v0, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;

    invoke-direct {v0, v4, v2, p1, v2}, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;-><init>(ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V

    throw v0

    :cond_c
    iget-object p1, p0, Lorg/snmp4j/util/ArgumentParser;->optionFormat:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isMandatory()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v6

    if-eqz v6, :cond_10

    move v6, v3

    :goto_7
    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v7

    array-length v7, v7

    if-ge v6, v7, :cond_10

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v7

    aget-object v7, v7, v6

    if-nez v7, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v7

    aget-object v7, v7, v6

    invoke-virtual {v7}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getDefaultValue()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v7

    aget-object v7, v7, v6

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v8

    aget-object v8, v8, v6

    invoke-virtual {v8}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getDefaultValue()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v7, v8, v1, v6}, Lorg/snmp4j/util/ArgumentParser;->parseParameterValue(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_12

    new-instance p1, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_11

    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v0

    aget-object v0, v0, v3

    goto :goto_9

    :cond_11
    move-object v0, v2

    :goto_9
    invoke-direct {p1, v4, v2, v1, v0}, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;-><init>(ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V

    throw p1

    :cond_12
    invoke-virtual {v1}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v5, v0}, Lorg/snmp4j/util/ArgumentParser;->addValues2Option(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    goto/16 :goto_6

    :cond_13
    return-object v0
.end method

.method protected parseParameterValue(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;I)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;
        }
    .end annotation

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_0
    move-object v6, p2

    invoke-static {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$500(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/util/regex/Pattern;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-static {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$500(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->matches()Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Value \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->isParameter()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "parameter "

    goto :goto_0

    :cond_1
    const-string v3, "option "

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getOption()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v3

    array-length v3, v3

    if-le v3, v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " part "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const-string v2, ""

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not match pattern \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->access$500(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v3, p2

    move v5, p4

    move-object v7, p3

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V

    throw p2

    :cond_3
    invoke-virtual {p1}, Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;->getType()I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v2, :cond_5

    const/4 p2, 0x3

    if-eq p1, p2, :cond_4

    return-object v6

    :cond_4
    const/16 p1, 0x3a

    invoke-static {v6, p1}, Lorg/snmp4j/smi/OctetString;->fromHexString(Ljava/lang/String;C)Lorg/snmp4j/smi/OctetString;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v6}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v6}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method protected parseValues([Ljava/lang/String;ILorg/snmp4j/util/ArgumentParser$ArgumentFormat;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "I",
            "Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;",
            ")",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v0

    array-length v0, v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    add-int v3, v2, p2

    array-length v4, p1

    if-ge v3, v4, :cond_0

    if-ge v2, v0, :cond_0

    :try_start_0
    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v4

    aget-object v4, v4, v2

    aget-object v5, p1, v3

    invoke-virtual {p0, v4, v5, p3, v3}, Lorg/snmp4j/util/ArgumentParser;->parseParameterValue(Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;Ljava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/snmp4j/util/ArgumentParser$ArgumentParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;

    aget-object p1, p1, v3

    invoke-virtual {p3}, Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;->getParameters()[Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-direct {p2, v3, p1, p3, v0}, Lorg/snmp4j/util/ArgumentParser$ArgumentParseException;-><init>(ILjava/lang/String;Lorg/snmp4j/util/ArgumentParser$ArgumentFormat;Lorg/snmp4j/util/ArgumentParser$ArgumentParameter;)V

    throw p2

    :goto_2
    throw p1

    :cond_0
    return-object v1
.end method
