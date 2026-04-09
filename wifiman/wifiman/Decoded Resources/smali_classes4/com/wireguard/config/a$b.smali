.class public final Lcom/wireguard/config/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/config/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private b:Lcom/wireguard/config/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/wireguard/config/a$b;->a:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/wireguard/config/a$b;)Lcom/wireguard/config/b;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/a$b;->b:Lcom/wireguard/config/b;

    return-object p0
.end method

.method static synthetic b(Lcom/wireguard/config/a$b;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/wireguard/config/a$b;->a:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public c(Lcom/wireguard/config/c;)Lcom/wireguard/config/a$b;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/config/a$b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d()Lcom/wireguard/config/a;
    .locals 2

    iget-object v0, p0, Lcom/wireguard/config/a$b;->b:Lcom/wireguard/config/b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/wireguard/config/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/wireguard/config/a;-><init>(Lcom/wireguard/config/a$b;Lcom/wireguard/config/a$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "An [Interface] section is required"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lcom/wireguard/config/b;)Lcom/wireguard/config/a$b;
    .locals 0

    iput-object p1, p0, Lcom/wireguard/config/a$b;->b:Lcom/wireguard/config/b;

    return-object p0
.end method
