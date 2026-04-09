.class final Lcom/ui/binme/a$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/binme/a;->b([B)Lcom/ui/binme/BinaryMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/binme/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/binme/a$c;

    invoke-direct {v0}, Lcom/ui/binme/a$c;-><init>()V

    sput-object v0, Lcom/ui/binme/a$c;->a:Lcom/ui/binme/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)Lcom/ui/binme/BinaryMessage$d$b;
    .locals 1

    const-string/jumbo v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "compression"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/binme/BinaryMessage$d$b;

    invoke-direct {v0, p1, p2, p3}, Lcom/ui/binme/BinaryMessage$d$b;-><init>(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)V

    return-object v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/binme/BinaryMessage$c;

    check-cast p2, Lcom/ui/binme/BinaryMessage$b;

    check-cast p3, [B

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/binme/a$c;->a(Lcom/ui/binme/BinaryMessage$c;Lcom/ui/binme/BinaryMessage$b;[B)Lcom/ui/binme/BinaryMessage$d$b;

    move-result-object p1

    return-object p1
.end method
