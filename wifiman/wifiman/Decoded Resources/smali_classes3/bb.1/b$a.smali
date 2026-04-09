.class public final Lbb/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lbb/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbb/b$a;

    invoke-direct {v0}, Lbb/b$a;-><init>()V

    sput-object v0, Lbb/b$a;->a:Lbb/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)Lbb/b;
    .locals 2

    new-instance v0, Lbb/c;

    new-instance v1, Lab/f;

    invoke-direct {v1}, Lab/f;-><init>()V

    invoke-direct {v0, v1, p1}, Lbb/c;-><init>(Lab/f;Z)V

    return-object v0
.end method
