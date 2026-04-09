.class public final synthetic Lu9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lu9/c;

.field public final synthetic c:LT/q0;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroidx/compose/ui/focus/o;

.field public final synthetic f:I

.field public final synthetic g:LCi/e;

.field public final synthetic h:Lmh/l;

.field public final synthetic i:Lmh/l;

.field public final synthetic j:Lmh/l;

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/h;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lu9/h;->b:Lu9/c;

    iput-object p3, p0, Lu9/h;->c:LT/q0;

    iput-object p4, p0, Lu9/h;->d:Ljava/lang/String;

    iput-object p5, p0, Lu9/h;->e:Landroidx/compose/ui/focus/o;

    iput p6, p0, Lu9/h;->f:I

    iput-object p7, p0, Lu9/h;->g:LCi/e;

    iput-object p8, p0, Lu9/h;->h:Lmh/l;

    iput-object p9, p0, Lu9/h;->i:Lmh/l;

    iput-object p10, p0, Lu9/h;->j:Lmh/l;

    iput p11, p0, Lu9/h;->k:I

    iput p12, p0, Lu9/h;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lu9/h;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, Lu9/h;->b:Lu9/c;

    iget-object v3, v0, Lu9/h;->c:LT/q0;

    iget-object v4, v0, Lu9/h;->d:Ljava/lang/String;

    iget-object v5, v0, Lu9/h;->e:Landroidx/compose/ui/focus/o;

    iget v6, v0, Lu9/h;->f:I

    iget-object v7, v0, Lu9/h;->g:LCi/e;

    iget-object v8, v0, Lu9/h;->h:Lmh/l;

    iget-object v9, v0, Lu9/h;->i:Lmh/l;

    iget-object v10, v0, Lu9/h;->j:Lmh/l;

    iget v11, v0, Lu9/h;->k:I

    iget v12, v0, Lu9/h;->l:I

    move-object/from16 v13, p1

    check-cast v13, LT/l;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static/range {v1 .. v14}, Lu9/k;->b(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
