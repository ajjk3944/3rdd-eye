.class public final Lpg/j;
.super Lgg/b;
.source "SourceFile"


# static fields
.field public static final a:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpg/j;

    invoke-direct {v0}, Lpg/j;-><init>()V

    sput-object v0, Lpg/j;->a:Lgg/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    return-void
.end method


# virtual methods
.method public V(Lgg/d;)V
    .locals 0

    invoke-static {p1}, Llg/c;->complete(Lgg/d;)V

    return-void
.end method
