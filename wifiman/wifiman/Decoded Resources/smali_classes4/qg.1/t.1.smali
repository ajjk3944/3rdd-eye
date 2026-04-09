.class public final Lqg/t;
.super Lgg/i;
.source "SourceFile"

# interfaces
.implements LDg/e;


# static fields
.field public static final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqg/t;

    invoke-direct {v0}, Lqg/t;-><init>()V

    sput-object v0, Lqg/t;->b:Lgg/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 0

    invoke-static {p1}, Lyg/d;->complete(LDj/b;)V

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
