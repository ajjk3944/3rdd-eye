.class Lv4/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lv4/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lv4/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly4/c;Ljava/lang/String;Ljava/lang/String;)Ly4/b$a;
    .locals 0

    sget-object p1, Lv4/f;->a:Ly4/b$a;

    return-object p1
.end method
