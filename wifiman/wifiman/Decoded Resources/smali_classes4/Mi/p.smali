.class final LMi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/e;


# static fields
.field public static final a:LMi/p;

.field private static final b:Ldh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMi/p;

    invoke-direct {v0}, LMi/p;-><init>()V

    sput-object v0, LMi/p;->a:LMi/p;

    sget-object v0, Ldh/j;->a:Ldh/j;

    sput-object v0, LMi/p;->b:Ldh/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Ldh/i;
    .locals 1

    sget-object v0, LMi/p;->b:Ldh/i;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
