.class final LA/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V
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

.field final synthetic e:Lz/c$m;

.field final synthetic f:Lf0/c$b;

.field final synthetic g:Lw/n;

.field final synthetic h:Z

.field final synthetic i:Lmh/l;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;II)V
    .locals 0

    iput-object p1, p0, LA/b$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LA/b$a;->b:LA/B;

    iput-object p3, p0, LA/b$a;->c:Lz/N;

    iput-boolean p4, p0, LA/b$a;->d:Z

    iput-object p5, p0, LA/b$a;->e:Lz/c$m;

    iput-object p6, p0, LA/b$a;->f:Lf0/c$b;

    iput-object p7, p0, LA/b$a;->g:Lw/n;

    iput-boolean p8, p0, LA/b$a;->h:Z

    iput-object p9, p0, LA/b$a;->i:Lmh/l;

    iput p10, p0, LA/b$a;->j:I

    iput p11, p0, LA/b$a;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    iget-object v0, p0, LA/b$a;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LA/b$a;->b:LA/B;

    iget-object v2, p0, LA/b$a;->c:Lz/N;

    iget-boolean v3, p0, LA/b$a;->d:Z

    iget-object v4, p0, LA/b$a;->e:Lz/c$m;

    iget-object v5, p0, LA/b$a;->f:Lf0/c$b;

    iget-object v6, p0, LA/b$a;->g:Lw/n;

    iget-boolean v7, p0, LA/b$a;->h:Z

    iget-object v8, p0, LA/b$a;->i:Lmh/l;

    iget p2, p0, LA/b$a;->j:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    iget v11, p0, LA/b$a;->k:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LA/b;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZLz/c$m;Lf0/c$b;Lw/n;ZLmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LA/b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
