.class public final Lcom/ui/comm/v4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/comm/v4/b$a;

.field private final b:[B


# direct methods
.method public constructor <init>(Lcom/ui/comm/v4/b$a;[B)V
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/comm/v4/b;->a:Lcom/ui/comm/v4/b$a;

    iput-object p2, p0, Lcom/ui/comm/v4/b;->b:[B

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/b;->b:[B

    return-object v0
.end method

.method public final b()Lcom/ui/comm/v4/b$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/b;->a:Lcom/ui/comm/v4/b$a;

    return-object v0
.end method
