.class final Lo7/l$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/l;-><init>(Ljava/util/List;Lgg/y;JLmh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo7/l;


# direct methods
.method constructor <init>(Lo7/l;)V
    .locals 0

    iput-object p1, p0, Lo7/l$f;->a:Lo7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)LDj/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LAg/e;->a:LAg/e;

    iget-object v0, p0, Lo7/l$f;->a:Lo7/l;

    invoke-static {v0}, Lo7/l;->i(Lo7/l;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lo7/l$f;->a:Lo7/l;

    invoke-static {v1}, Lo7/l;->g(Lo7/l;)Lgg/z;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object p1

    new-instance v0, Lo7/l$f$a;

    iget-object v1, p0, Lo7/l$f;->a:Lo7/l;

    invoke-direct {v0, v1}, Lo7/l$f$a;-><init>(Lo7/l;)V

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lo7/l$f;->a(LYg/J;)LDj/a;

    move-result-object p1

    return-object p1
.end method
