.class public final Ln7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln7/c;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln7/c;

    invoke-direct {v0}, Ln7/c;-><init>()V

    sput-object v0, Ln7/c;->a:Ln7/c;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ln7/d;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, Ln7/e;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, Ln7/f;->a(Ljava/util/HashMap;)V

    invoke-static {v0}, Ln7/g;->a(Ljava/util/HashMap;)V

    sput-object v0, Ln7/c;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    sget-object v0, Ln7/c;->b:Ljava/util/Map;

    return-object v0
.end method
