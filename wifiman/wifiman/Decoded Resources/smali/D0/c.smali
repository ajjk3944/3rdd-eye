.class public abstract LD0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lmh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LD0/c;->a:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LD0/c;-><init>(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public final a()Lmh/a;
    .locals 1

    iget-object v0, p0, LD0/c;->a:Lmh/a;

    return-object v0
.end method
