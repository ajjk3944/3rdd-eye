.class public Lcom/wireguard/config/BadConfigException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/config/BadConfigException$c;,
        Lcom/wireguard/config/BadConfigException$b;,
        Lcom/wireguard/config/BadConfigException$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/wireguard/config/BadConfigException$a;

.field private final b:Lcom/wireguard/config/BadConfigException$b;

.field private final c:Lcom/wireguard/config/BadConfigException$c;

.field private final d:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 6
    invoke-direct/range {v0 .. v5}, Lcom/wireguard/config/BadConfigException;-><init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;Ljava/lang/Throwable;)V

    return-void
.end method

.method private constructor <init>(Lcom/wireguard/config/BadConfigException$c;Lcom/wireguard/config/BadConfigException$a;Lcom/wireguard/config/BadConfigException$b;Ljava/lang/CharSequence;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p5}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p1, p0, Lcom/wireguard/config/BadConfigException;->c:Lcom/wireguard/config/BadConfigException$c;

    .line 3
    iput-object p2, p0, Lcom/wireguard/config/BadConfigException;->a:Lcom/wireguard/config/BadConfigException$a;

    .line 4
    iput-object p3, p0, Lcom/wireguard/config/BadConfigException;->b:Lcom/wireguard/config/BadConfigException$b;

    .line 5
    iput-object p4, p0, Lcom/wireguard/config/BadConfigException;->d:Ljava/lang/CharSequence;

    return-void
.end method
