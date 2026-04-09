.class public final Lz7/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lz7/q$a;

.field private static b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/q$a;

    invoke-direct {v0}, Lz7/q$a;-><init>()V

    sput-object v0, Lz7/q$a;->a:Lz7/q$a;

    sget-object v0, Lz7/q$a$a;->a:Lz7/q$a$a;

    sput-object v0, Lz7/q$a;->b:Lmh/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/DatagramSocket;Lp7/b;)Lz7/q;
    .locals 1

    const-string/jumbo v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "provider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz7/q$a;->b:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz7/q;

    return-object p1
.end method
