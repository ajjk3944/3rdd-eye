.class final Lz7/u$a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/u$a;->j()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz7/u$a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/u$a$f;

    invoke-direct {v0}, Lz7/u$a$f;-><init>()V

    sput-object v0, Lz7/u$a$f;->a:Lz7/u$a$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/DatagramPacket;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lz7/u$a$f$a;->a:Lz7/u$a$f$a;

    invoke-static {p1}, Lx7/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/net/DatagramPacket;

    invoke-virtual {p0, p1}, Lz7/u$a$f;->a(Ljava/net/DatagramPacket;)V

    return-void
.end method
