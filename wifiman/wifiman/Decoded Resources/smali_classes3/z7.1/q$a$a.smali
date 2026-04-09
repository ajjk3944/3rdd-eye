.class final Lz7/q$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz7/q$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/q$a$a;

    invoke-direct {v0}, Lz7/q$a$a;-><init>()V

    sput-object v0, Lz7/q$a$a;->a:Lz7/q$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/DatagramSocket;Lp7/b;)Lz7/u;
    .locals 1

    const-string/jumbo v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "provider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz7/u;

    invoke-direct {v0, p1, p2}, Lz7/u;-><init>(Ljava/net/DatagramSocket;Lp7/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/DatagramSocket;

    check-cast p2, Lp7/b;

    invoke-virtual {p0, p1, p2}, Lz7/q$a$a;->a(Ljava/net/DatagramSocket;Lp7/b;)Lz7/u;

    move-result-object p1

    return-object p1
.end method
