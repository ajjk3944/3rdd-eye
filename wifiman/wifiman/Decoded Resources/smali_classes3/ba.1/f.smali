.class public final synthetic Lba/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/n1;

.field public final synthetic b:LIi/N;

.field public final synthetic c:Lba/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/n1;LIi/N;Lba/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/f;->a:Landroidx/compose/ui/platform/n1;

    iput-object p2, p0, Lba/f;->b:LIi/N;

    iput-object p3, p0, Lba/f;->c:Lba/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lba/f;->a:Landroidx/compose/ui/platform/n1;

    iget-object v1, p0, Lba/f;->b:LIi/N;

    iget-object v2, p0, Lba/f;->c:Lba/l;

    invoke-static {v0, v1, v2}, Lba/j;->d(Landroidx/compose/ui/platform/n1;LIi/N;Lba/l;)LYg/J;

    move-result-object v0

    return-object v0
.end method
