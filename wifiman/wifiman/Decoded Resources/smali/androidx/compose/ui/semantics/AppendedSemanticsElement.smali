.class public final Landroidx/compose/ui/semantics/AppendedSemanticsElement;
.super LE0/V;
.source "SourceFile"

# interfaces
.implements LJ0/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LE0/V;",
        "LJ0/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/AppendedSemanticsElement;",
        "LE0/V;",
        "LJ0/c;",
        "LJ0/l;",
        "",
        "mergeDescendants",
        "Lkotlin/Function1;",
        "LJ0/w;",
        "LYg/J;",
        "properties",
        "<init>",
        "(ZLmh/l;)V",
        "d",
        "()LJ0/c;",
        "node",
        "e",
        "(LJ0/c;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "getMergeDescendants",
        "()Z",
        "b",
        "Lmh/l;",
        "getProperties",
        "()Lmh/l;",
        "LJ0/j;",
        "U1",
        "()LJ0/j;",
        "semanticsConfiguration",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLmh/l;)V
    .locals 0

    invoke-direct {p0}, LE0/V;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iput-object p2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public U1()LJ0/j;
    .locals 2

    new-instance v0, LJ0/j;

    invoke-direct {v0}, LJ0/j;-><init>()V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-virtual {v0, v1}, LJ0/j;->x(Z)V

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic a()Landroidx/compose/ui/e$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->d()LJ0/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroidx/compose/ui/e$c;)V
    .locals 0

    check-cast p1, LJ0/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->e(LJ0/c;)V

    return-void
.end method

.method public d()LJ0/c;
    .locals 4

    new-instance v0, LJ0/c;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    const/4 v2, 0x0

    iget-object v3, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-direct {v0, v1, v2, v3}, LJ0/c;-><init>(ZZLmh/l;)V

    return-object v0
.end method

.method public e(LJ0/c;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-virtual {p1, v0}, LJ0/c;->D2(Z)V

    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-virtual {p1, v0}, LJ0/c;->E2(Lmh/l;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    iget-boolean v3, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    iget-object p1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppendedSemanticsElement(mergeDescendants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->b:Lmh/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
