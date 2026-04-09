.class public final Lgi/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lgi/f$a;

.field private static final b:Lgi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgi/f$a;

    invoke-direct {v0}, Lgi/f$a;-><init>()V

    sput-object v0, Lgi/f$a;->a:Lgi/f$a;

    new-instance v0, Lgi/a;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lgi/a;-><init>(Ljava/util/List;)V

    sput-object v0, Lgi/f$a;->b:Lgi/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lgi/a;
    .locals 1

    sget-object v0, Lgi/f$a;->b:Lgi/a;

    return-object v0
.end method
