.class public final synthetic LTe/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/d;

.field public final synthetic c:LL0/U;

.field public final synthetic d:J

.field public final synthetic e:LCi/c;

.field public final synthetic f:LL0/U;

.field public final synthetic g:J

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/d;LL0/U;JLCi/c;LL0/U;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTe/o0;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LTe/o0;->b:Ls9/d;

    iput-object p3, p0, LTe/o0;->c:LL0/U;

    iput-wide p4, p0, LTe/o0;->d:J

    iput-object p6, p0, LTe/o0;->e:LCi/c;

    iput-object p7, p0, LTe/o0;->f:LL0/U;

    iput-wide p8, p0, LTe/o0;->g:J

    iput p10, p0, LTe/o0;->h:I

    iput p11, p0, LTe/o0;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LTe/o0;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LTe/o0;->b:Ls9/d;

    iget-object v2, p0, LTe/o0;->c:LL0/U;

    iget-wide v3, p0, LTe/o0;->d:J

    iget-object v5, p0, LTe/o0;->e:LCi/c;

    iget-object v6, p0, LTe/o0;->f:LL0/U;

    iget-wide v7, p0, LTe/o0;->g:J

    iget v9, p0, LTe/o0;->h:I

    iget v10, p0, LTe/o0;->i:I

    move-object v11, p1

    check-cast v11, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, LTe/w0;->a(Landroidx/compose/ui/e;Ls9/d;LL0/U;JLCi/c;LL0/U;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
