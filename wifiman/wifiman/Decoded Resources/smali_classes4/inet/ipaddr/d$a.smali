.class public abstract Linet/ipaddr/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/d$a$a;
    }
.end annotation


# static fields
.field public static final e:Linet/ipaddr/d$c;


# instance fields
.field public final a:Linet/ipaddr/d$c;

.field public final b:Z

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Linet/ipaddr/d$c;->h:Linet/ipaddr/d$c;

    sput-object v0, Linet/ipaddr/d$a;->e:Linet/ipaddr/d$c;

    return-void
.end method

.method public constructor <init>(ZZLinet/ipaddr/d$c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean p4, p0, Linet/ipaddr/d$a;->b:Z

    iput-boolean p1, p0, Linet/ipaddr/d$a;->c:Z

    iput-boolean p2, p0, Linet/ipaddr/d$a;->d:Z

    return-void
.end method


# virtual methods
.method protected c(Linet/ipaddr/d$a;)I
    .locals 2

    iget-object v0, p0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    iget-object v1, p1, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0, v1}, Linet/ipaddr/d$c;->r(Linet/ipaddr/d$c;)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$a;->b:Z

    iget-boolean v1, p1, Linet/ipaddr/d$a;->b:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$a;->c:Z

    iget-boolean p1, p1, Linet/ipaddr/d$a;->c:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method protected d(Linet/ipaddr/d$a$a;)Linet/ipaddr/d$a$a;
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$a;->d:Z

    iput-boolean v0, p1, Linet/ipaddr/d$a$a;->d:Z

    iget-object v0, p0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    iput-object v0, p1, Linet/ipaddr/d$a$a;->a:Linet/ipaddr/d$c;

    iget-boolean v0, p0, Linet/ipaddr/d$a;->b:Z

    iput-boolean v0, p1, Linet/ipaddr/d$a$a;->b:Z

    iget-boolean v0, p0, Linet/ipaddr/d$a;->c:Z

    iput-boolean v0, p1, Linet/ipaddr/d$a$a;->c:Z

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Linet/ipaddr/d$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/d$a;

    iget-object v0, p0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    iget-object v2, p1, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0, v2}, Linet/ipaddr/d$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$a;->d:Z

    iget-boolean v2, p1, Linet/ipaddr/d$a;->d:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$a;->b:Z

    iget-boolean v2, p1, Linet/ipaddr/d$a;->b:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$a;->c:Z

    iget-boolean p1, p1, Linet/ipaddr/d$a;->c:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Linet/ipaddr/d$a;->a:Linet/ipaddr/d$c;

    invoke-virtual {v0}, Linet/ipaddr/d$c;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Linet/ipaddr/d$a;->d:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x8

    :cond_0
    iget-boolean v1, p0, Linet/ipaddr/d$a;->b:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x10

    :cond_1
    iget-boolean v1, p0, Linet/ipaddr/d$a;->c:Z

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x20

    :cond_2
    return v0
.end method
