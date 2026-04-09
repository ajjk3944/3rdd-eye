.class final LA/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/b;->b(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$e;Lf0/c$c;Lw/n;ZLmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LA/B;

.field final synthetic c:Lz/N;

.field final synthetic d:Z

.field final synthetic e:Lz/c$e;

.field final synthetic f:Lf0/c$c;

.field final synthetic g:Lw/n;

.field final synthetic h:Z

.field final synthetic i:Lmh/l;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$e;Lf0/c$c;Lw/n;ZLmh/l;II)V
    .locals 0

    iput-object p1, p0, LA/b$b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LA/b$b;->b:LA/B;

    iput-object p3, p0, LA/b$b;->c:Lz/N;

    iput-boolean p4, p0, LA/b$b;->d:Z

    iput-object p5, p0, LA/b$b;->e:Lz/c$e;

    iput-object p6, p0, LA/b$b;->f:Lf0/c$c;

    iput-object p7, p0, LA/b$b;->g:Lw/n;

    iput-boolean p8, p0, LA/b$b;->h:Z

    iput-object p9, p0, LA/b$b;->i:Lmh/l;

    iput p10, p0, LA/b$b;->j:I

    iput p11, p0, LA/b$b;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    iget-object v0, p0, LA/b$b;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LA/b$b;->b:LA/B;

    iget-object v2, p0, LA/b$b;->c:Lz/N;

    iget-boolean v3, p0, LA/b$b;->d:Z

    iget-object v4, p0, LA/b$b;->e:Lz/c$e;

    iget-object v5, p0, LA/b$b;->f:Lf0/c$c;

    iget-object v6, p0, LA/b$b;->g:Lw/n;

    iget-boolean v7, p0, LA/b$b;->h:Z

    iget-object v8, p0, LA/b$b;->i:Lmh/l;

    iget p2, p0, LA/b$b;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    iget v11, p0, LA/b$b;->k:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LA/b;->b(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$e;Lf0/c$c;Lw/n;ZLmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LA/b$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
