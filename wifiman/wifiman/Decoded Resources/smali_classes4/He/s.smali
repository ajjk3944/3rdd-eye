.class public final synthetic LHe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LHe/p;

.field public final synthetic c:J

.field public final synthetic d:Lmh/q;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LHe/p;JLmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHe/s;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LHe/s;->b:LHe/p;

    iput-wide p3, p0, LHe/s;->c:J

    iput-object p5, p0, LHe/s;->d:Lmh/q;

    iput p6, p0, LHe/s;->e:I

    iput p7, p0, LHe/s;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, LHe/s;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LHe/s;->b:LHe/p;

    iget-wide v2, p0, LHe/s;->c:J

    iget-object v4, p0, LHe/s;->d:Lmh/q;

    iget v5, p0, LHe/s;->e:I

    iget v6, p0, LHe/s;->f:I

    move-object v7, p1

    check-cast v7, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, LHe/v;->c(Landroidx/compose/ui/e;LHe/p;JLmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
