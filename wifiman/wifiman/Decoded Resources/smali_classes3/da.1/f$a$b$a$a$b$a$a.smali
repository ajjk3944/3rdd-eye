.class final Lda/f$a$b$a$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f$a$b$a$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;


# direct methods
.method constructor <init>(Lf2/w;)V
    .locals 0

    iput-object p1, p0, Lda/f$a$b$a$a$b$a$a;->a:Lf2/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1, p2}, Lda/f$a$b$a$a$b$a$a;->b(LYg/J;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(LYg/J;Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lda/f$a$b$a$a$b$a$a;->a:Lf2/w;

    sget-object p1, Lda/t$b;->a:Lda/t$b;

    invoke-virtual {p1}, Lda/t$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
