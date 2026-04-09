.class public abstract Lv4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/l$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Ljava/lang/Class;


# direct methods
.method private constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv4/l;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lv4/l;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/l$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv4/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static b(Lv4/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/l;
    .locals 1

    new-instance v0, Lv4/l$a;

    invoke-direct {v0, p1, p2, p0}, Lv4/l$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/l$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lo4/g;)Ljava/lang/Object;
.end method

.method public c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/l;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/l;->b:Ljava/lang/Class;

    return-object v0
.end method
