.class public abstract Lm0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lm0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/c1$a;

    invoke-direct {v0}, Lm0/c1$a;-><init>()V

    sput-object v0, Lm0/c1;->a:Lm0/i1;

    return-void
.end method

.method public static final a()Lm0/i1;
    .locals 1

    sget-object v0, Lm0/c1;->a:Lm0/i1;

    return-object v0
.end method
