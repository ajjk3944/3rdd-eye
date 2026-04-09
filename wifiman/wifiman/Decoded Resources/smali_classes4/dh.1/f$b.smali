.class public final Ldh/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Ldh/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldh/f$b;

    invoke-direct {v0}, Ldh/f$b;-><init>()V

    sput-object v0, Ldh/f$b;->a:Ldh/f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
