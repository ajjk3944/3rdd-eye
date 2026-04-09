.class public final Lf0/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Lf0/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/g$b;

    invoke-direct {v0}, Lf0/g$b;-><init>()V

    sput-object v0, Lf0/g$b;->a:Lf0/g$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
