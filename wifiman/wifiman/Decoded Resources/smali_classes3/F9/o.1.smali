.class public final synthetic LF9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:Z

.field public final synthetic h:Lmh/q;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/o;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LF9/o;->b:Ljava/lang/String;

    iput-object p3, p0, LF9/o;->c:Ljava/lang/String;

    iput-wide p4, p0, LF9/o;->d:J

    iput-wide p6, p0, LF9/o;->e:J

    iput p8, p0, LF9/o;->f:I

    iput-boolean p9, p0, LF9/o;->g:Z

    iput-object p10, p0, LF9/o;->h:Lmh/q;

    iput p11, p0, LF9/o;->i:I

    iput p12, p0, LF9/o;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LF9/o;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LF9/o;->b:Ljava/lang/String;

    iget-object v3, v0, LF9/o;->c:Ljava/lang/String;

    iget-wide v4, v0, LF9/o;->d:J

    iget-wide v6, v0, LF9/o;->e:J

    iget v8, v0, LF9/o;->f:I

    iget-boolean v9, v0, LF9/o;->g:Z

    iget-object v10, v0, LF9/o;->h:Lmh/q;

    iget v11, v0, LF9/o;->i:I

    iget v12, v0, LF9/o;->j:I

    move-object/from16 v13, p1

    check-cast v13, LT/l;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static/range {v1 .. v14}, LF9/q;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJIZLmh/q;IILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
