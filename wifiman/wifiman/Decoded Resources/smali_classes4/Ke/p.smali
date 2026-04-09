.class public final synthetic LKe/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Integer;

.field public final synthetic d:Ls9/d;

.field public final synthetic e:Ljava/lang/Float;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/Integer;Ls9/d;Ljava/lang/Float;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKe/p;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LKe/p;->b:Ljava/lang/String;

    iput-object p3, p0, LKe/p;->c:Ljava/lang/Integer;

    iput-object p4, p0, LKe/p;->d:Ls9/d;

    iput-object p5, p0, LKe/p;->e:Ljava/lang/Float;

    iput p6, p0, LKe/p;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LKe/p;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LKe/p;->b:Ljava/lang/String;

    iget-object v2, p0, LKe/p;->c:Ljava/lang/Integer;

    iget-object v3, p0, LKe/p;->d:Ls9/d;

    iget-object v4, p0, LKe/p;->e:Ljava/lang/Float;

    iget v5, p0, LKe/p;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LKe/s;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/Integer;Ls9/d;Ljava/lang/Float;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
