.class public final LE0/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:I


# instance fields
.field private final a:LV/b;

.field private final b:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, LV/b;->d:I

    sput v0, LE0/X;->c:I

    return-void
.end method

.method public constructor <init>(LV/b;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/X;->a:LV/b;

    iput-object p2, p0, LE0/X;->b:Lmh/a;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0, p1, p2}, LV/b;->a(ILjava/lang/Object;)V

    iget-object p1, p0, LE0/X;->b:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    iget-object v0, p0, LE0/X;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    return v0
.end method

.method public final f()LV/b;
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    return-object v0
.end method

.method public final g(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE0/X;->a:LV/b;

    invoke-virtual {v0, p1}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LE0/X;->b:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-object p1
.end method
