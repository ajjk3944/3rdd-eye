.class public final Lc5/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final d:LZ4/c;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:LZ4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc5/g;

    invoke-direct {v0}, Lc5/g;-><init>()V

    sput-object v0, Lc5/h$a;->d:LZ4/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lc5/h$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lc5/h$a;->b:Ljava/util/Map;

    sget-object v0, Lc5/h$a;->d:LZ4/c;

    iput-object v0, p0, Lc5/h$a;->c:LZ4/c;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;LZ4/d;)V
    .locals 0

    invoke-static {p0, p1}, Lc5/h$a;->e(Ljava/lang/Object;LZ4/d;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Object;LZ4/d;)V
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


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;LZ4/c;)La5/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lc5/h$a;->f(Ljava/lang/Class;LZ4/c;)Lc5/h$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lc5/h;
    .locals 4

    new-instance v0, Lc5/h;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lc5/h$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lc5/h$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Lc5/h$a;->c:LZ4/c;

    invoke-direct {v0, v1, v2, v3}, Lc5/h;-><init>(Ljava/util/Map;Ljava/util/Map;LZ4/c;)V

    return-object v0
.end method

.method public d(La5/a;)Lc5/h$a;
    .locals 0

    invoke-interface {p1, p0}, La5/a;->a(La5/b;)V

    return-object p0
.end method

.method public f(Ljava/lang/Class;LZ4/c;)Lc5/h$a;
    .locals 1

    iget-object v0, p0, Lc5/h$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lc5/h$a;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
