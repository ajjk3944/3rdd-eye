.class public final synthetic LL9/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Z

.field public final synthetic d:Lmh/a;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/N;->a:Ljava/lang/String;

    iput-object p2, p0, LL9/N;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LL9/N;->c:Z

    iput-object p4, p0, LL9/N;->d:Lmh/a;

    iput p5, p0, LL9/N;->e:I

    iput p6, p0, LL9/N;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LL9/N;->a:Ljava/lang/String;

    iget-object v1, p0, LL9/N;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LL9/N;->c:Z

    iget-object v3, p0, LL9/N;->d:Lmh/a;

    iget v4, p0, LL9/N;->e:I

    iget v5, p0, LL9/N;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LL9/O;->a(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
