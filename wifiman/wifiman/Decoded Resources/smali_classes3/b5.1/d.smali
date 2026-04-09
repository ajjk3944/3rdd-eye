.class public final Lb5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb5/d$b;
    }
.end annotation


# static fields
.field private static final e:LZ4/c;

.field private static final f:LZ4/e;

.field private static final g:LZ4/e;

.field private static final h:Lb5/d$b;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:LZ4/c;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb5/a;

    invoke-direct {v0}, Lb5/a;-><init>()V

    sput-object v0, Lb5/d;->e:LZ4/c;

    new-instance v0, Lb5/b;

    invoke-direct {v0}, Lb5/b;-><init>()V

    sput-object v0, Lb5/d;->f:LZ4/e;

    new-instance v0, Lb5/c;

    invoke-direct {v0}, Lb5/c;-><init>()V

    sput-object v0, Lb5/d;->g:LZ4/e;

    new-instance v0, Lb5/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb5/d$b;-><init>(Lb5/d$a;)V

    sput-object v0, Lb5/d;->h:Lb5/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb5/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb5/d;->b:Ljava/util/Map;

    sget-object v0, Lb5/d;->e:LZ4/c;

    iput-object v0, p0, Lb5/d;->c:LZ4/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb5/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lb5/d;->f:LZ4/e;

    invoke-virtual {p0, v0, v1}, Lb5/d;->p(Ljava/lang/Class;LZ4/e;)Lb5/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lb5/d;->g:LZ4/e;

    invoke-virtual {p0, v0, v1}, Lb5/d;->p(Ljava/lang/Class;LZ4/e;)Lb5/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Lb5/d;->h:Lb5/d$b;

    invoke-virtual {p0, v0, v1}, Lb5/d;->p(Ljava/lang/Class;LZ4/e;)Lb5/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Boolean;LZ4/f;)V
    .locals 0

    invoke-static {p0, p1}, Lb5/d;->n(Ljava/lang/Boolean;LZ4/f;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Object;LZ4/d;)V
    .locals 0

    invoke-static {p0, p1}, Lb5/d;->l(Ljava/lang/Object;LZ4/d;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;LZ4/f;)V
    .locals 0

    invoke-static {p0, p1}, Lb5/d;->m(Ljava/lang/String;LZ4/f;)V

    return-void
.end method

.method static synthetic e(Lb5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lb5/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(Lb5/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lb5/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic g(Lb5/d;)LZ4/c;
    .locals 0

    iget-object p0, p0, Lb5/d;->c:LZ4/c;

    return-object p0
.end method

.method static synthetic h(Lb5/d;)Z
    .locals 0

    iget-boolean p0, p0, Lb5/d;->d:Z

    return p0
.end method

.method private static synthetic l(Ljava/lang/Object;LZ4/d;)V
    .locals 2

    new-instance p1, Lcom/google/firebase/encoders/EncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static synthetic m(Ljava/lang/String;LZ4/f;)V
    .locals 0

    invoke-interface {p1, p0}, LZ4/f;->a(Ljava/lang/String;)LZ4/f;

    return-void
.end method

.method private static synthetic n(Ljava/lang/Boolean;LZ4/f;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, LZ4/f;->g(Z)LZ4/f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;LZ4/c;)La5/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb5/d;->o(Ljava/lang/Class;LZ4/c;)Lb5/d;

    move-result-object p1

    return-object p1
.end method

.method public i()LZ4/a;
    .locals 1

    new-instance v0, Lb5/d$a;

    invoke-direct {v0, p0}, Lb5/d$a;-><init>(Lb5/d;)V

    return-object v0
.end method

.method public j(La5/a;)Lb5/d;
    .locals 0

    invoke-interface {p1, p0}, La5/a;->a(La5/b;)V

    return-object p0
.end method

.method public k(Z)Lb5/d;
    .locals 0

    iput-boolean p1, p0, Lb5/d;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;LZ4/c;)Lb5/d;
    .locals 1

    iget-object v0, p0, Lb5/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lb5/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;LZ4/e;)Lb5/d;
    .locals 1

    iget-object v0, p0, Lb5/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lb5/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
