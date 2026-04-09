.class public final LIh/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LIh/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LIh/c$a;

    invoke-direct {v0}, LIh/c$a;-><init>()V

    sput-object v0, LIh/c$a;->a:LIh/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
