.class public final LF4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF4/c$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/Set;

.field private final c:Ljava/util/Set;

.field private final d:I

.field private final e:I

.field private final f:LF4/g;

.field private final g:Ljava/util/Set;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILF4/g;Ljava/util/Set;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF4/c;->a:Ljava/lang/String;

    .line 4
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LF4/c;->b:Ljava/util/Set;

    .line 5
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LF4/c;->c:Ljava/util/Set;

    .line 6
    iput p4, p0, LF4/c;->d:I

    .line 7
    iput p5, p0, LF4/c;->e:I

    .line 8
    iput-object p6, p0, LF4/c;->f:LF4/g;

    .line 9
    invoke-static {p7}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LF4/c;->g:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILF4/g;Ljava/util/Set;LF4/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LF4/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILF4/g;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LF4/c;->r(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LF4/c;->q(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(LF4/A;)LF4/c$b;
    .locals 3

    new-instance v0, LF4/c$b;

    const/4 v1, 0x0

    new-array v1, v1, [LF4/A;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LF4/c$b;-><init>(LF4/A;[LF4/A;LF4/c$a;)V

    return-object v0
.end method

.method public static varargs d(LF4/A;[LF4/A;)LF4/c$b;
    .locals 2

    new-instance v0, LF4/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LF4/c$b;-><init>(LF4/A;[LF4/A;LF4/c$a;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Class;)LF4/c$b;
    .locals 3

    new-instance v0, LF4/c$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LF4/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;LF4/c$a;)V

    return-object v0
.end method

.method public static varargs f(Ljava/lang/Class;[Ljava/lang/Class;)LF4/c$b;
    .locals 2

    new-instance v0, LF4/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LF4/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;LF4/c$a;)V

    return-object v0
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/Class;)LF4/c;
    .locals 1

    invoke-static {p1}, LF4/c;->m(Ljava/lang/Class;)LF4/c$b;

    move-result-object p1

    new-instance v0, LF4/a;

    invoke-direct {v0, p0}, LF4/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object p0

    invoke-virtual {p0}, LF4/c$b;->c()LF4/c;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Class;)LF4/c$b;
    .locals 0

    invoke-static {p0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object p0

    invoke-static {p0}, LF4/c$b;->a(LF4/c$b;)LF4/c$b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic q(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method private static synthetic r(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static varargs s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)LF4/c;
    .locals 0

    invoke-static {p1, p2}, LF4/c;->f(Ljava/lang/Class;[Ljava/lang/Class;)LF4/c$b;

    move-result-object p1

    new-instance p2, LF4/b;

    invoke-direct {p2, p0}, LF4/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object p0

    invoke-virtual {p0}, LF4/c$b;->c()LF4/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LF4/c;->c:Ljava/util/Set;

    return-object v0
.end method

.method public h()LF4/g;
    .locals 1

    iget-object v0, p0, LF4/c;->f:LF4/g;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF4/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LF4/c;->b:Ljava/util/Set;

    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LF4/c;->g:Ljava/util/Set;

    return-object v0
.end method

.method public n()Z
    .locals 2

    iget v0, p0, LF4/c;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public o()Z
    .locals 2

    iget v0, p0, LF4/c;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Z
    .locals 1

    iget v0, p0, LF4/c;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t(LF4/g;)LF4/c;
    .locals 9

    new-instance v8, LF4/c;

    iget-object v1, p0, LF4/c;->a:Ljava/lang/String;

    iget-object v2, p0, LF4/c;->b:Ljava/util/Set;

    iget-object v3, p0, LF4/c;->c:Ljava/util/Set;

    iget v4, p0, LF4/c;->d:I

    iget v5, p0, LF4/c;->e:I

    iget-object v7, p0, LF4/c;->g:Ljava/util/Set;

    move-object v0, v8

    move-object v6, p1

    invoke-direct/range {v0 .. v7}, LF4/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILF4/g;Ljava/util/Set;)V

    return-object v8
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Component<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LF4/c;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF4/c;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF4/c;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF4/c;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
