.class public abstract LYa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYa/a$a;,
        LYa/a$b;,
        LYa/a$c;
    }
.end annotation


# static fields
.field public static final a:LYa/a$a;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYa/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYa/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYa/a;->a:LYa/a$a;

    const-string/jumbo v0, "^(W/)?(\".+\")$"

    sput-object v0, LYa/a;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYa/a;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, LYa/a;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method
