.class public abstract Lv4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/c$b;
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
    iput-object p1, p0, Lv4/c;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lv4/c;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv4/c;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lv4/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/c;
    .locals 1

    new-instance v0, Lv4/c$a;

    invoke-direct {v0, p1, p2, p0}, Lv4/c$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lv4/c$b;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/c;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/c;->b:Ljava/lang/Class;

    return-object v0
.end method
