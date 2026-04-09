.class public final synthetic LBe/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ls9/a;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Ls9/a$b;

.field public final synthetic d:Ls9/a$b;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:F

.field public final synthetic g:J

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/v;->a:Ls9/a;

    iput-object p2, p0, LBe/v;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LBe/v;->c:Ls9/a$b;

    iput-object p4, p0, LBe/v;->d:Ls9/a$b;

    iput-object p5, p0, LBe/v;->e:Ljava/lang/String;

    iput p6, p0, LBe/v;->f:F

    iput-wide p7, p0, LBe/v;->g:J

    iput p9, p0, LBe/v;->h:I

    iput p10, p0, LBe/v;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, LBe/v;->a:Ls9/a;

    iget-object v1, p0, LBe/v;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LBe/v;->c:Ls9/a$b;

    iget-object v3, p0, LBe/v;->d:Ls9/a$b;

    iget-object v4, p0, LBe/v;->e:Ljava/lang/String;

    iget v5, p0, LBe/v;->f:F

    iget-wide v6, p0, LBe/v;->g:J

    iget v8, p0, LBe/v;->h:I

    iget v9, p0, LBe/v;->i:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, LBe/w;->a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
