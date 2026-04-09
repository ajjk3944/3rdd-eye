.class public final Lq5/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:[Lth/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/H;

    const-string/jumbo v1, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v2, 0x0

    const-class v3, Lq5/f$b;

    const-string/jumbo v4, "dataStore"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/H;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->i(Lkotlin/jvm/internal/G;)Lth/o;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lth/l;

    aput-object v0, v1, v2

    sput-object v1, Lq5/f$b;->a:[Lth/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq5/f$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lq5/f$b;Landroid/content/Context;)LO1/e;
    .locals 0

    invoke-direct {p0, p1}, Lq5/f$b;->b(Landroid/content/Context;)LO1/e;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/content/Context;)LO1/e;
    .locals 3

    invoke-static {}, Lq5/f;->a()Lph/c;

    move-result-object v0

    sget-object v1, Lq5/f$b;->a:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p1, v1}, Lph/c;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO1/e;

    return-object p1
.end method


# virtual methods
.method public final c()Lq5/f;
    .locals 2

    sget-object v0, Lcom/google/firebase/c;->a:Lcom/google/firebase/c;

    invoke-static {v0}, Lcom/google/firebase/l;->a(Lcom/google/firebase/c;)Lcom/google/firebase/f;

    move-result-object v0

    const-class v1, Lq5/f;

    invoke-virtual {v0, v1}, Lcom/google/firebase/f;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Firebase.app[SessionsSettings::class.java]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lq5/f;

    return-object v0
.end method
