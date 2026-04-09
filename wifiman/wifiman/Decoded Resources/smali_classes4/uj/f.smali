.class public final Luj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/f;


# static fields
.field public static final b:Luj/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/f;

    invoke-direct {v0}, Luj/f;-><init>()V

    sput-object v0, Luj/f;->b:Luj/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Luj/f;
    .locals 1

    sget-object v0, Luj/f;->b:Luj/f;

    return-object v0
.end method

.method public getType()Lorg/kodein/type/q;
    .locals 1

    sget-object v0, Lorg/kodein/type/q;->a:Lorg/kodein/type/q$a;

    invoke-virtual {v0}, Lorg/kodein/type/q$a;->a()Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Luj/f;->a()Luj/f;

    move-result-object v0

    return-object v0
.end method
