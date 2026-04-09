.class final Lad/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lad/c;->a(Ljava/lang/String;ILandroid/net/Network;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lad/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lad/c$b;

    invoke-direct {v0}, Lad/c$b;-><init>()V

    sput-object v0, Lad/c$b;->a:Lad/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lad/a$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetAddress;

    new-instance v1, Lad/a$a$b;

    invoke-direct {v1, p1, v0}, Lad/a$a$b;-><init>(Ljava/net/InetAddress;I)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lad/c$b;->a(LYg/s;)Lad/a$a;

    move-result-object p1

    return-object p1
.end method
