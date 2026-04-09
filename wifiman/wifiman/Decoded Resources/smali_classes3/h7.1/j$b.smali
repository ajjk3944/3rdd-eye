.class final Lh7/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/j;->d()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh7/j;


# direct methods
.method constructor <init>(Lh7/j;)V
    .locals 0

    iput-object p1, p0, Lh7/j$b;->a:Lh7/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk7/b;)V
    .locals 1

    const-string/jumbo v0, "detectedObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/j$b;->a:Lh7/j;

    invoke-static {v0}, Lh7/j;->c(Lh7/j;)Lh7/g;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->u()LFg/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LFg/c;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk7/b;

    invoke-virtual {p0, p1}, Lh7/j$b;->a(Lk7/b;)V

    return-void
.end method
