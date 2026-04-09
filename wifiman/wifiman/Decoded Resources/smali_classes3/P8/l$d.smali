.class final LP8/l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/l;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/l;


# direct methods
.method constructor <init>(LP8/l;)V
    .locals 0

    iput-object p1, p0, LP8/l$d;->a:LP8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/l$a;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/l$d;->a:LP8/l;

    invoke-static {v0, p1}, LP8/l;->q0(LP8/l;LP8/l$a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP8/l$a;

    invoke-virtual {p0, p1}, LP8/l$d;->a(LP8/l$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
