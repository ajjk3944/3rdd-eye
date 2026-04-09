.class final Lo7/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Lo7/l$g;->a:Lo7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDj/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lo7/l$g;->a:Lo7/l;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo7/l;->k(Lo7/l;Z)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lo7/l$g;->a(LDj/c;)V

    return-void
.end method
