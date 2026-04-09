.class public abstract Lv4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/j$b;
    }
.end annotation


# instance fields
.field private final a:LC4/a;

.field private final b:Ljava/lang/Class;


# direct methods
.method private constructor <init>(LC4/a;Ljava/lang/Class;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv4/j;->a:LC4/a;

    .line 4
    iput-object p2, p0, Lv4/j;->b:Ljava/lang/Class;

    return-void
.end method

.method synthetic constructor <init>(LC4/a;Ljava/lang/Class;Lv4/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv4/j;-><init>(LC4/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lv4/j$b;LC4/a;Ljava/lang/Class;)Lv4/j;
    .locals 1

    new-instance v0, Lv4/j$a;

    invoke-direct {v0, p1, p2, p0}, Lv4/j$a;-><init>(LC4/a;Ljava/lang/Class;Lv4/j$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()LC4/a;
    .locals 1

    iget-object v0, p0, Lv4/j;->a:LC4/a;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lv4/j;->b:Ljava/lang/Class;

    return-object v0
.end method
