.class LM6/a$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a$f;->b()Lkg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/a$f;


# direct methods
.method constructor <init>(LM6/a$f;)V
    .locals 0

    iput-object p1, p0, LM6/a$f$b;->a:LM6/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/N$d$a;)V
    .locals 2

    invoke-virtual {p1}, LG6/N$d$a;->a()I

    move-result p1

    iget-object v0, p0, LM6/a$f$b;->a:LM6/a$f;

    iget v1, v0, LM6/a$f;->c:I

    mul-int/2addr p1, v1

    iget-object v0, v0, LM6/a$f;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LG6/N$d$a;

    invoke-virtual {p0, p1}, LM6/a$f$b;->a(LG6/N$d$a;)V

    return-void
.end method
