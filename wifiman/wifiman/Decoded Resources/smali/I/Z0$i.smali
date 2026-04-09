.class final LI/Z0$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/Z0;->setComposingText(Ljava/lang/CharSequence;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/CharSequence;

.field final synthetic b:I


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;I)V
    .locals 0

    iput-object p1, p0, LI/Z0$i;->a:Ljava/lang/CharSequence;

    iput p2, p0, LI/Z0$i;->b:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LI/I;)V
    .locals 2

    iget-object v0, p0, LI/Z0$i;->a:Ljava/lang/CharSequence;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, LI/Z0$i;->b:I

    invoke-static {p1, v0, v1}, LI/H;->h(LI/I;Ljava/lang/String;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI/I;

    invoke-virtual {p0, p1}, LI/Z0$i;->a(LI/I;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
